@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnReceiptFilter
import software.amazon.awscdk.services.ses.CfnReceiptFilterProps
import software.constructs.Construct

public fun Construct.cfnReceiptFilter(
  id: String,
  props: CfnReceiptFilterProps,
  initializer: CfnReceiptFilter.() -> Unit = {},
): CfnReceiptFilter = CfnReceiptFilter(this, id, props).apply(initializer)
