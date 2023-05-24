package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations
import software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociationsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnClusterCapacityProviderAssociations(id: String,
    props: CfnClusterCapacityProviderAssociationsProps): CfnClusterCapacityProviderAssociations =
    CfnClusterCapacityProviderAssociations(this, id, props)

@Generated
public fun Construct.cfnClusterCapacityProviderAssociations(
  id: String,
  props: CfnClusterCapacityProviderAssociationsProps,
  initializer: @AwsCdkDsl CfnClusterCapacityProviderAssociations.() -> Unit,
): CfnClusterCapacityProviderAssociations = CfnClusterCapacityProviderAssociations(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnClusterCapacityProviderAssociations(id: String, initializer: @AwsCdkDsl
    CfnClusterCapacityProviderAssociations.Builder.() -> Unit):
    CfnClusterCapacityProviderAssociations =
    CfnClusterCapacityProviderAssociations.Builder.create(this, id).apply(initializer).build()
