package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions

@Generated
public
    fun grantOnPrincipalAndResourceOptions(initializer: GrantOnPrincipalAndResourceOptions.Builder.() -> Unit
    = {}): GrantOnPrincipalAndResourceOptions =
    GrantOnPrincipalAndResourceOptions.builder().apply(initializer).build()
