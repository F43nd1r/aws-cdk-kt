package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.FunctionAssociation

@Generated
public fun functionAssociation(initializer: FunctionAssociation.Builder.() -> Unit = {}):
    FunctionAssociation = FunctionAssociation.builder().apply(initializer).build()
