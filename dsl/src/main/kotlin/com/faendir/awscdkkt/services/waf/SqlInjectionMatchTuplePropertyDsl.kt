package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet

@Generated
public
    fun sqlInjectionMatchTupleProperty(initializer: CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder.() -> Unit
    = {}): CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty =
    CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.builder().apply(initializer).build()
