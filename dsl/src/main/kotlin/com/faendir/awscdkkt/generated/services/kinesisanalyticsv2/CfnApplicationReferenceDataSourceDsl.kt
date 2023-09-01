package com.faendir.awscdkkt.generated.services.kinesisanalyticsv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSourceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApplicationReferenceDataSource(
  id: String,
  props: CfnApplicationReferenceDataSourceProps,
  initializer: @AwsCdkDsl CfnApplicationReferenceDataSource.() -> Unit = {},
): CfnApplicationReferenceDataSource = CfnApplicationReferenceDataSource(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnApplicationReferenceDataSource(id: String, initializer: @AwsCdkDsl
    CfnApplicationReferenceDataSource.Builder.() -> Unit = {}): CfnApplicationReferenceDataSource =
    CfnApplicationReferenceDataSource.Builder.create(this, id).apply(initializer).build()
