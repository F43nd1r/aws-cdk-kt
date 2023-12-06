package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModel

@Generated
public fun buildModelDataSourceProperty(initializer: @AwsCdkDsl
    CfnModel.ModelDataSourceProperty.Builder.() -> Unit = {}): CfnModel.ModelDataSourceProperty =
    CfnModel.ModelDataSourceProperty.Builder().apply(initializer).build()
