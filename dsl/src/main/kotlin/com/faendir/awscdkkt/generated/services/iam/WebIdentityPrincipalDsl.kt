package com.faendir.awscdkkt.generated.services.iam

import javax.`annotation`.Generated
import kotlin.Any
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.iam.WebIdentityPrincipal

@Generated
public fun webIdentityPrincipal(identityProvider: String): WebIdentityPrincipal =
    WebIdentityPrincipal(identityProvider)

@Generated
public fun webIdentityPrincipal(identityProvider: String, conditions: Map<String, Any>):
    WebIdentityPrincipal = WebIdentityPrincipal(identityProvider, conditions)
