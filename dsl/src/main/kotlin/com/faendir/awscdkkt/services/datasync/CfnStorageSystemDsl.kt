@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnStorageSystem
import software.amazon.awscdk.services.datasync.CfnStorageSystemProps
import software.constructs.Construct

public fun Construct.cfnStorageSystem(
  id: String,
  props: CfnStorageSystemProps,
  initializer: CfnStorageSystem.() -> Unit = {},
): CfnStorageSystem = CfnStorageSystem(this, id, props).apply(initializer)
