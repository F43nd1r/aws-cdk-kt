@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps
import software.constructs.Construct

public fun Construct.cfnApplicationReferenceDataSource(
  id: String,
  props: CfnApplicationReferenceDataSourceProps,
  initializer: CfnApplicationReferenceDataSource.() -> Unit = {},
): CfnApplicationReferenceDataSource = CfnApplicationReferenceDataSource(this, id,
    props).apply(initializer)
