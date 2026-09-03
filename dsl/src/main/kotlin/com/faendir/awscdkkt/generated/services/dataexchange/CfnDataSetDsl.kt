package com.faendir.awscdkkt.generated.services.dataexchange

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dataexchange.CfnDataSet
import software.amazon.awscdk.services.dataexchange.CfnDataSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataSet(
  id: String,
  props: CfnDataSetProps,
  initializer: @AwsCdkDsl CfnDataSet.() -> Unit = {},
): CfnDataSet = CfnDataSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataSet(id: String, initializer: @AwsCdkDsl CfnDataSet.Builder.() -> Unit = {}): CfnDataSet = CfnDataSet.Builder.create(this, id).apply(initializer).build()
