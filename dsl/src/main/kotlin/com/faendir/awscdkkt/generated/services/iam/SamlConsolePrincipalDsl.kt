package com.faendir.awscdkkt.generated.services.iam

import javax.`annotation`.Generated
import kotlin.Any
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.iam.ISamlProvider
import software.amazon.awscdk.services.iam.SamlConsolePrincipal

@Generated
public fun samlConsolePrincipal(samlProvider: ISamlProvider): SamlConsolePrincipal =
    SamlConsolePrincipal(samlProvider)

@Generated
public fun samlConsolePrincipal(samlProvider: ISamlProvider, conditions: Map<String, Any>):
    SamlConsolePrincipal = SamlConsolePrincipal(samlProvider, conditions)
