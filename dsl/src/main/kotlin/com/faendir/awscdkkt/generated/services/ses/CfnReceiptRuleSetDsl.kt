package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnReceiptRuleSet
import software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReceiptRuleSet(id: String): CfnReceiptRuleSet = CfnReceiptRuleSet(this, id)

@Generated
public fun Construct.cfnReceiptRuleSet(id: String, initializer: @AwsCdkDsl
    CfnReceiptRuleSet.() -> Unit): CfnReceiptRuleSet = CfnReceiptRuleSet(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnReceiptRuleSet(id: String, props: CfnReceiptRuleSetProps): CfnReceiptRuleSet
    = CfnReceiptRuleSet(this, id, props)

@Generated
public fun Construct.cfnReceiptRuleSet(
  id: String,
  props: CfnReceiptRuleSetProps,
  initializer: @AwsCdkDsl CfnReceiptRuleSet.() -> Unit,
): CfnReceiptRuleSet = CfnReceiptRuleSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReceiptRuleSet(id: String, initializer: @AwsCdkDsl
    CfnReceiptRuleSet.Builder.() -> Unit): CfnReceiptRuleSet =
    CfnReceiptRuleSet.Builder.create(this, id).apply(initializer).build()
