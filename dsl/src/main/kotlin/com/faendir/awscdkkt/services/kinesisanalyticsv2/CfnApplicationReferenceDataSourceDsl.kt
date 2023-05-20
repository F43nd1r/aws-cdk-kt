@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
