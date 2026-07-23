package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolReplica
import software.amazon.awscdk.services.cognito.CfnUserPoolReplicaProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserPoolReplica(
  id: String,
  props: CfnUserPoolReplicaProps,
  initializer: @AwsCdkDsl CfnUserPoolReplica.() -> Unit = {},
): CfnUserPoolReplica = CfnUserPoolReplica(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUserPoolReplica(id: String, initializer: @AwsCdkDsl CfnUserPoolReplica.Builder.() -> Unit = {}): CfnUserPoolReplica = CfnUserPoolReplica.Builder.create(this, id).apply(initializer).build()
