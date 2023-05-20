@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnIndex
import software.amazon.awscdk.services.kendra.CfnIndexProps
import software.constructs.Construct

public fun Construct.cfnIndex(
  id: String,
  props: CfnIndexProps,
  initializer: CfnIndex.() -> Unit = {},
): CfnIndex = CfnIndex(this, id, props).apply(initializer)
