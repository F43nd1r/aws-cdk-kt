@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet

public
    fun sqlInjectionMatchTupleProperty(initializer: CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder.() -> Unit):
    CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty =
    CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.builder().apply(initializer).build()
