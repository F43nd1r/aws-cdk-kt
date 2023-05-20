@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.AllowListReceiptFilter
import software.amazon.awscdk.services.ses.AllowListReceiptFilterProps
import software.constructs.Construct

public fun Construct.allowListReceiptFilter(
  id: String,
  props: AllowListReceiptFilterProps,
  initializer: AllowListReceiptFilter.() -> Unit = {},
): AllowListReceiptFilter = AllowListReceiptFilter(this, id, props).apply(initializer)
