package com.faendir.awscdkkt.services.kms

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
  initializer: CfnReplicaKey.() -> Unit = {},
): CfnReplicaKey = CfnReplicaKey(this, id, props).apply(initializer)
