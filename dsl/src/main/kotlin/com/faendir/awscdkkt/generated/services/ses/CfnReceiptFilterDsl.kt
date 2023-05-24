package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnReceiptFilter
import software.amazon.awscdk.services.ses.CfnReceiptFilterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReceiptFilter(id: String, props: CfnReceiptFilterProps): CfnReceiptFilter =
    CfnReceiptFilter(this, id, props)

@Generated
public fun Construct.cfnReceiptFilter(
  id: String,
  props: CfnReceiptFilterProps,
  initializer: @AwsCdkDsl CfnReceiptFilter.() -> Unit,
): CfnReceiptFilter = CfnReceiptFilter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReceiptFilter(id: String, initializer: @AwsCdkDsl
    CfnReceiptFilter.Builder.() -> Unit): CfnReceiptFilter = CfnReceiptFilter.Builder.create(this,
    id).apply(initializer).build()
