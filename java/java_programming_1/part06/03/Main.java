/*
 * Main.java
 * Copyright (C) 2020  Rigved Rakshit
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */


public class Main
{
    public static void main(String[] args)
    {
        Message newMessage = new Message("Harvey Dent", "You either die a hero, or you live long enough to see yourself become a villian.");
        Message newLongMessage = new Message("Lorem Ipsum", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Sed risus pretium quam vulputate dignissim suspendisse in est. Ornare lectus sit amet est placerat in egestas erat imperdiet. Dolor magna eget est lorem. Scelerisque mauris pellentesque pulvinar pellentesque habitant morbi tristique senectus et. In mollis nunc sed id semper risus in hendrerit. Vulputate dignissim suspendisse in est ante. Nibh tellus molestie nunc non blandit massa enim nec dui. Cras fermentum odio eu feugiat pretium nibh ipsum consequat. Massa tincidunt dui ut ornare lectus. Mattis aliquam faucibus purus in massa tempor.\n" +
                "\n" +
                "Hendrerit dolor magna eget est lorem. A scelerisque purus semper eget duis. Nec ullamcorper sit amet risus nullam eget felis eget nunc. Aliquam id diam maecenas ultricies mi eget mauris pharetra. Nisl tincidunt eget nullam non nisi est. Id neque aliquam vestibulum morbi blandit cursus risus. Adipiscing diam donec adipiscing tristique risus nec feugiat in. Accumsan sit amet nulla facilisi morbi tempus iaculis. Habitasse platea dictumst vestibulum rhoncus est. Duis tristique sollicitudin nibh sit amet commodo nulla facilisi.");

        MessagingService messagingService = new MessagingService();

        System.out.println(messagingService.getMessages());

        messagingService.add(newMessage);

        System.out.println(messagingService.getMessages());

        messagingService.add(newLongMessage);

        System.out.println(messagingService.getMessages());

        messagingService.add(newMessage);

        System.out.println(messagingService.getMessages());
    }
}
