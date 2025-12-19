package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnDataTableRecord
import software.amazon.awscdk.services.connect.CfnDataTableRecordProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataTableRecord(id: String, initializer: @AwsCdkDsl CfnDataTableRecord.() -> Unit = {}): CfnDataTableRecord = CfnDataTableRecord(this, id).apply(initializer)

@Generated
public fun Construct.cfnDataTableRecord(
  id: String,
  props: CfnDataTableRecordProps,
  initializer: @AwsCdkDsl CfnDataTableRecord.() -> Unit = {},
): CfnDataTableRecord = CfnDataTableRecord(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataTableRecord(id: String, initializer: @AwsCdkDsl CfnDataTableRecord.Builder.() -> Unit = {}): CfnDataTableRecord = CfnDataTableRecord.Builder.create(this, id).apply(initializer).build()
