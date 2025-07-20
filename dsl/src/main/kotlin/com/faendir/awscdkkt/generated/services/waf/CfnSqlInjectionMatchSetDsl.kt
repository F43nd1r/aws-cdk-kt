package com.faendir.awscdkkt.generated.services.waf

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet
import software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSqlInjectionMatchSet(
  id: String,
  props: CfnSqlInjectionMatchSetProps,
  initializer: @AwsCdkDsl CfnSqlInjectionMatchSet.() -> Unit = {},
): CfnSqlInjectionMatchSet = CfnSqlInjectionMatchSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSqlInjectionMatchSet(id: String, initializer: @AwsCdkDsl CfnSqlInjectionMatchSet.Builder.() -> Unit = {}): CfnSqlInjectionMatchSet = CfnSqlInjectionMatchSet.Builder.create(this, id).apply(initializer).build()
