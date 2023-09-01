package com.faendir.awscdkkt.generated.services.kms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kms.CfnReplicaKey
import software.amazon.awscdk.services.kms.CfnReplicaKeyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReplicaKey(
  id: String,
  props: CfnReplicaKeyProps,
  initializer: @AwsCdkDsl CfnReplicaKey.() -> Unit = {},
): CfnReplicaKey = CfnReplicaKey(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReplicaKey(id: String, initializer: @AwsCdkDsl
    CfnReplicaKey.Builder.() -> Unit = {}): CfnReplicaKey = CfnReplicaKey.Builder.create(this,
    id).apply(initializer).build()
