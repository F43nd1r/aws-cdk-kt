package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.LookupMachineImage
import software.amazon.awscdk.services.ec2.LookupMachineImageProps

@Generated
public fun lookupMachineImage(props: LookupMachineImageProps): LookupMachineImage =
    LookupMachineImage(props)

@Generated
public fun buildLookupMachineImage(initializer: @AwsCdkDsl LookupMachineImage.Builder.() -> Unit):
    LookupMachineImage = LookupMachineImage.Builder.create().apply(initializer).build()
