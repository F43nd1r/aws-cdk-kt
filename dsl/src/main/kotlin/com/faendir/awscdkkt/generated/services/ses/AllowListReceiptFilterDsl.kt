package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.AllowListReceiptFilter
import software.amazon.awscdk.services.ses.AllowListReceiptFilterProps
import software.constructs.Construct

@Generated
public fun Construct.allowListReceiptFilter(
  id: String,
  props: AllowListReceiptFilterProps,
  initializer: @AwsCdkDsl AllowListReceiptFilter.() -> Unit = {},
): AllowListReceiptFilter = AllowListReceiptFilter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAllowListReceiptFilter(id: String, initializer: @AwsCdkDsl
    AllowListReceiptFilter.Builder.() -> Unit = {}): AllowListReceiptFilter =
    AllowListReceiptFilter.Builder.create(this, id).apply(initializer).build()
