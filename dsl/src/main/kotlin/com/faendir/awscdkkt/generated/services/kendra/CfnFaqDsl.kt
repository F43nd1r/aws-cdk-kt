package com.faendir.awscdkkt.generated.services.kendra

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnFaq
import software.amazon.awscdk.services.kendra.CfnFaqProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFaq(
  id: String,
  props: CfnFaqProps,
  initializer: @AwsCdkDsl CfnFaq.() -> Unit = {},
): CfnFaq = CfnFaq(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFaq(id: String, initializer: @AwsCdkDsl CfnFaq.Builder.() -> Unit =
    {}): CfnFaq = CfnFaq.Builder.create(this, id).apply(initializer).build()
