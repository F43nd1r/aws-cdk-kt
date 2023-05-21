package com.faendir.awscdkkt.services.waf.regional

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet

@Generated
public
    fun sqlInjectionMatchTupleProperty(initializer: CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder.() -> Unit
    = {}): CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty =
    CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.builder().apply(initializer).build()
