package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.NamedPackageOptions

@Generated
public fun namedPackageOptions(initializer: NamedPackageOptions.Builder.() -> Unit = {}):
    NamedPackageOptions = NamedPackageOptions.builder().apply(initializer).build()
