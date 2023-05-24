package com.faendir.awscdkkt.generated.services.iam

import javax.`annotation`.Generated
import kotlin.Any
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.iam.FederatedPrincipal

@Generated
public fun federatedPrincipal(
  federated: String,
  conditions: Map<String, Any>,
  assumeRoleAction: String,
): FederatedPrincipal = FederatedPrincipal(federated, conditions, assumeRoleAction)

@Generated
public fun federatedPrincipal(federated: String, conditions: Map<String, Any>): FederatedPrincipal =
    FederatedPrincipal(federated, conditions)

@Generated
public fun federatedPrincipal(federated: String): FederatedPrincipal = FederatedPrincipal(federated)
