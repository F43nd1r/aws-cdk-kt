@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnFaq
import software.amazon.awscdk.services.kendra.CfnFaqProps
import software.constructs.Construct

public fun Construct.cfnFaq(
  id: String,
  props: CfnFaqProps,
  initializer: CfnFaq.() -> Unit = {},
): CfnFaq = CfnFaq(this, id, props).apply(initializer)
