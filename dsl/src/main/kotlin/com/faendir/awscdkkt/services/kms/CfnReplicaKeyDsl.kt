@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kms

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kms.CfnReplicaKey
import software.amazon.awscdk.services.kms.CfnReplicaKeyProps
import software.constructs.Construct

public fun Construct.cfnReplicaKey(
  id: String,
  props: CfnReplicaKeyProps,
  initializer: CfnReplicaKey.() -> Unit = {},
): CfnReplicaKey = CfnReplicaKey(this, id, props).apply(initializer)
