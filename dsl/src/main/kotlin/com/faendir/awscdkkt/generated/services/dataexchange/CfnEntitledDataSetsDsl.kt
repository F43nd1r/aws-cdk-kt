package com.faendir.awscdkkt.generated.services.dataexchange

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dataexchange.CfnEntitledDataSets
import software.amazon.awscdk.services.dataexchange.CfnEntitledDataSetsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEntitledDataSets(id: String, initializer: @AwsCdkDsl CfnEntitledDataSets.() -> Unit = {}): CfnEntitledDataSets = CfnEntitledDataSets(this, id).apply(initializer)

@Generated
public fun Construct.cfnEntitledDataSets(
  id: String,
  props: CfnEntitledDataSetsProps,
  initializer: @AwsCdkDsl CfnEntitledDataSets.() -> Unit = {},
): CfnEntitledDataSets = CfnEntitledDataSets(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEntitledDataSets(id: String, initializer: @AwsCdkDsl CfnEntitledDataSets.Builder.() -> Unit = {}): CfnEntitledDataSets = CfnEntitledDataSets.Builder.create(this, id).apply(initializer).build()
