package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.LocationPackageOptions

@Generated
public fun locationPackageOptions(initializer: LocationPackageOptions.Builder.() -> Unit = {}):
    LocationPackageOptions = LocationPackageOptions.builder().apply(initializer).build()
