@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
