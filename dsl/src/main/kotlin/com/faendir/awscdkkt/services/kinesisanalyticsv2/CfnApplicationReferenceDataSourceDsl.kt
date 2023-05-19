@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSourceProps
import software.constructs.Construct

public fun Construct.cfnApplicationReferenceDataSource(
  id: String,
  props: CfnApplicationReferenceDataSourceProps,
  initializer: CfnApplicationReferenceDataSource.() -> Unit = {},
): CfnApplicationReferenceDataSource = CfnApplicationReferenceDataSource(this, id,
    props).apply(initializer)
