package com.faendir.awscdkkt.services.lakeformation

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
  initializer: CfnDataCellsFilter.() -> Unit = {},
): CfnDataCellsFilter = CfnDataCellsFilter(this, id, props).apply(initializer)
