package com.faendir.awscdkkt.generated.services.iam

import javax.`annotation`.Generated
import kotlin.Any
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.iam.IPrincipal
import software.amazon.awscdk.services.iam.PrincipalWithConditions

@Generated
public fun principalWithConditions(principal: IPrincipal, conditions: Map<String, Any>):
    PrincipalWithConditions = PrincipalWithConditions(principal, conditions)
