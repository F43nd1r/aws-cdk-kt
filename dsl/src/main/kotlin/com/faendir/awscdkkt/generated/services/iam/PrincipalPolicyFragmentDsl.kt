package com.faendir.awscdkkt.generated.services.iam

import javax.`annotation`.Generated
import kotlin.Any
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import software.amazon.awscdk.services.iam.PrincipalPolicyFragment

@Generated
public fun principalPolicyFragment(principalJson: Map<String, List<String>>):
    PrincipalPolicyFragment = PrincipalPolicyFragment(principalJson)

@Generated
public fun principalPolicyFragment(principalJson: Map<String, List<String>>,
    conditions: Map<String, Any>): PrincipalPolicyFragment = PrincipalPolicyFragment(principalJson,
    conditions)
