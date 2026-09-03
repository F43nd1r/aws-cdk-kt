package com.faendir.awscdkkt.generated.services.agentregistry

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.agentregistry.CfnRegistryRecord
import software.amazon.awscdk.services.agentregistry.CfnRegistryRecordProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRegistryRecord(
  id: String,
  props: CfnRegistryRecordProps,
  initializer: @AwsCdkDsl CfnRegistryRecord.() -> Unit = {},
): CfnRegistryRecord = CfnRegistryRecord(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRegistryRecord(id: String, initializer: @AwsCdkDsl CfnRegistryRecord.Builder.() -> Unit = {}): CfnRegistryRecord = CfnRegistryRecord.Builder.create(this, id).apply(initializer).build()
