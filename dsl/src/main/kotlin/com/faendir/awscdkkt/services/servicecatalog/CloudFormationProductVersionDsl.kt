package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion

@Generated
public fun cloudFormationProductVersion(initializer: CloudFormationProductVersion.Builder.() -> Unit
    = {}): CloudFormationProductVersion =
    CloudFormationProductVersion.builder().apply(initializer).build()
