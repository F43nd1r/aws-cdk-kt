@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet
import software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSetProps
import software.constructs.Construct

public fun Construct.cfnSqlInjectionMatchSet(
  id: String,
  props: CfnSqlInjectionMatchSetProps,
  initializer: CfnSqlInjectionMatchSet.() -> Unit = {},
): CfnSqlInjectionMatchSet = CfnSqlInjectionMatchSet(this, id, props).apply(initializer)
