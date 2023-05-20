@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnByteMatchSet
import software.amazon.awscdk.services.waf.CfnByteMatchSetProps
import software.constructs.Construct

public fun Construct.cfnByteMatchSet(
  id: String,
  props: CfnByteMatchSetProps,
  initializer: CfnByteMatchSet.() -> Unit = {},
): CfnByteMatchSet = CfnByteMatchSet(this, id, props).apply(initializer)
