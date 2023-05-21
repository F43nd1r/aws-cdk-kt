package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.GrantWithResourceOptions

@Generated
public fun grantWithResourceOptions(initializer: GrantWithResourceOptions.Builder.() -> Unit = {}):
    GrantWithResourceOptions = GrantWithResourceOptions.builder().apply(initializer).build()
