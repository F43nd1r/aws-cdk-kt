package com.faendir.awscdkkt.generated.services.personalize

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnDatasetGroup
import software.amazon.awscdk.services.personalize.CfnDatasetGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDatasetGroup(
  id: String,
  props: CfnDatasetGroupProps,
  initializer: @AwsCdkDsl CfnDatasetGroup.() -> Unit = {},
): CfnDatasetGroup = CfnDatasetGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDatasetGroup(id: String, initializer: @AwsCdkDsl CfnDatasetGroup.Builder.() -> Unit = {}): CfnDatasetGroup = CfnDatasetGroup.Builder.create(this, id).apply(initializer).build()
