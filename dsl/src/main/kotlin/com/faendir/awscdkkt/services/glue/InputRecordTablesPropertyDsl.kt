package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnMLTransform

@Generated
public
    fun inputRecordTablesProperty(initializer: CfnMLTransform.InputRecordTablesProperty.Builder.() -> Unit
    = {}): CfnMLTransform.InputRecordTablesProperty =
    CfnMLTransform.InputRecordTablesProperty.builder().apply(initializer).build()
