@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
