package com.faendir.awscdkkt.generated.services.iam

import javax.`annotation`.Generated
import kotlin.Any
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.iam.ISamlProvider
import software.amazon.awscdk.services.iam.SamlPrincipal

@Generated
public fun samlPrincipal(samlProvider: ISamlProvider, conditions: Map<String, Any>): SamlPrincipal =
    SamlPrincipal(samlProvider, conditions)
