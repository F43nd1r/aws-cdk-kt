package com.faendir.awscdkkt.generated.services.waf

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnByteMatchSet
import software.amazon.awscdk.services.waf.CfnByteMatchSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnByteMatchSet(
  id: String,
  props: CfnByteMatchSetProps,
  initializer: @AwsCdkDsl CfnByteMatchSet.() -> Unit = {},
): CfnByteMatchSet = CfnByteMatchSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnByteMatchSet(id: String, initializer: @AwsCdkDsl
    CfnByteMatchSet.Builder.() -> Unit = {}): CfnByteMatchSet = CfnByteMatchSet.Builder.create(this,
    id).apply(initializer).build()
