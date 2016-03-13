package by.group.apteka.rest.resource.packge;

import by.group.apteka.domain.Package;
import by.group.apteka.domain.PackageDetails;
import by.group.apteka.rest.model.RestResponse;
import by.group.apteka.rest.util.RestResponseUtil;
import by.group.apteka.service.api.IPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * Date: Mar 13, 2016
 */
@RestController
@RequestMapping(value = "/package")
public class PackageResource {

    @Autowired
    private RestResponseUtil restResponseUtil;

    @Autowired
    private IPackageService packageService;

    @RequestMapping(value = "/{drugTitle}", method = RequestMethod.GET)
    public RestResponse packagesByDrug(@PathVariable(value = "drugTitle") String drugTitle) {
        List<Package> packages = packageService.findPackagesByDrug(drugTitle);
        return restResponseUtil.createSuccessRestResponse(packages);
    }

    @RequestMapping(value = "/details/{packageId}", method = RequestMethod.GET)
    public RestResponse packageDetails(@PathVariable(value = "packageId") Integer packageId) {
        Package detailedPackage = packageService.findWithDetailsById(packageId);
        removeCircularDependencies(detailedPackage);
        return restResponseUtil.createSuccessRestResponse(detailedPackage);
    }

    private void removeCircularDependencies(Package detailedPackage) {
        for (PackageDetails packageDetails : detailedPackage.getPackageDetailsList()) {
            packageDetails.getPharmacy().setPackages(Collections.EMPTY_LIST);
        }
    }
}
