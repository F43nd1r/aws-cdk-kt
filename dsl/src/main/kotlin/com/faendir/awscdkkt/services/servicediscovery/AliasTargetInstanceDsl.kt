@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.AliasTargetInstance
import software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps
import software.constructs.Construct

public fun Construct.aliasTargetInstance(
  id: String,
  props: AliasTargetInstanceProps,
  initializer: AliasTargetInstance.() -> Unit = {},
): AliasTargetInstance = AliasTargetInstance(this, id, props).apply(initializer)
