package com.faendir.awscdkkt.generated.services.iam

import javax.`annotation`.Generated
import kotlin.Any
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.iam.IOpenIdConnectProvider
import software.amazon.awscdk.services.iam.OpenIdConnectPrincipal

@Generated
public fun openIdConnectPrincipal(openIdConnectProvider: IOpenIdConnectProvider):
    OpenIdConnectPrincipal = OpenIdConnectPrincipal(openIdConnectProvider)

@Generated
public fun openIdConnectPrincipal(openIdConnectProvider: IOpenIdConnectProvider,
    conditions: Map<String, Any>): OpenIdConnectPrincipal =
    OpenIdConnectPrincipal(openIdConnectProvider, conditions)
