package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTableProps

@Generated
public fun buildCfnTableProps(initializer: @AwsCdkDsl CfnTableProps.Builder.() -> Unit):
    CfnTableProps = CfnTableProps.Builder().apply(initializer).build()
