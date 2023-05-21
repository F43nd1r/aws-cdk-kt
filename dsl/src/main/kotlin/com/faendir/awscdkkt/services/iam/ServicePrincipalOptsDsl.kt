package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.ServicePrincipalOpts

@Generated
public fun servicePrincipalOpts(initializer: ServicePrincipalOpts.Builder.() -> Unit = {}):
    ServicePrincipalOpts = ServicePrincipalOpts.builder().apply(initializer).build()
