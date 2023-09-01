package com.faendir.awscdkkt.generated.services.lakeformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter
import software.amazon.awscdk.services.lakeformation.CfnDataCellsFilterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataCellsFilter(
  id: String,
  props: CfnDataCellsFilterProps,
  initializer: @AwsCdkDsl CfnDataCellsFilter.() -> Unit = {},
): CfnDataCellsFilter = CfnDataCellsFilter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataCellsFilter(id: String, initializer: @AwsCdkDsl
    CfnDataCellsFilter.Builder.() -> Unit = {}): CfnDataCellsFilter =
    CfnDataCellsFilter.Builder.create(this, id).apply(initializer).build()
